package com.example.dindinn.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.FragmentActivity
import com.example.dindinn.network.Response
import org.json.JSONObject
import retrofit2.HttpException
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object AppUtils {

    fun isNetworkAvailable(context: Context?): Boolean {
        val cm = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        val activeNetwork = cm?.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }

    fun getException(e: Exception): Response.Failure<Nothing> {
        if ((e as HttpException).response()?.errorBody() != null) {
            var errorMessage = AppConstants.defaultErrorMessage
            try {
                val jsonObject = JSONObject(e.response()?.errorBody()?.string())
                errorMessage = jsonObject.getString("message")
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Response.Failure(errorMessage, null)
        } else {
            return Response.Failure(AppConstants.defaultErrorMessage, null)
        }
    }


    fun hideKeyboard(hostActivity: FragmentActivity?) {
        val inputMethodManager =
            hostActivity?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        try {
            inputMethodManager.hideSoftInputFromWindow(hostActivity.currentFocus!!.windowToken, 0)
        } catch (ex: NullPointerException) {
            Log.v("HideKeyboard", ex.toString())
        }
    }


    fun getFormattedDate(time: String?, inputPattern: String?, outputPattern: String?): String? {
        return if (time != null && time.length > 0) {
            val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
            val outputFormat = SimpleDateFormat(outputPattern, Locale.ENGLISH)
            var date: Date? = null
            var str: String? = null
            try {
                date = inputFormat.parse(time)
                str = outputFormat.format(date)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            str
        } else {
            ""
        }
    }

    fun getCurrentSecond(): String? {
        val inputFormat = SimpleDateFormat("ss", Locale.ENGLISH)
        var date = Date()
        try {
            return inputFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
            return "0"
        }
    }

    fun calculateTimeDifference(
        startDate: String?,
        endDate: String?,
        inputPattern: String?
    ): String? {
        var convertedTime = ""
        val prefix = ""
        val suffix = ""
        try {


            val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
            val endTime = inputFormat.parse(endDate)
            val nowTime = Date()
            var dateDiff = endTime.time - nowTime!!.time
            //long different = endDate.getTime() - startDate.getTime();
            if (dateDiff > 0) {
                val secondsInMilli: Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24
                val elapsedDays = (dateDiff / daysInMilli).toInt()
                dateDiff = dateDiff % daysInMilli
                val elapsedHours = (dateDiff / hoursInMilli).toInt()
                dateDiff = dateDiff % hoursInMilli
                var elapsedMinutes = (dateDiff / minutesInMilli).toInt()
                dateDiff = dateDiff % minutesInMilli
                val elapsedSeconds = (dateDiff / secondsInMilli).toInt()
                dateDiff = dateDiff % minutesInMilli
                if(elapsedSeconds>0){
                    elapsedMinutes = elapsedMinutes+1
                }
                if (elapsedDays > 0) {
                    convertedTime = if (elapsedDays == 1) {
                        "$convertedTime$elapsedDays Day "
                    } else {
                        "$convertedTime$elapsedDays Days "
                    }
                }
                if (elapsedHours > 0) {
                    convertedTime = if (elapsedHours == 1) {
                        "$convertedTime$elapsedHours Hour "
                    } else {
                        "$convertedTime$elapsedHours Hours "
                    }
                }
                if (elapsedMinutes > 0) {
                    convertedTime = if (elapsedMinutes == 1) {
                        "$convertedTime$elapsedMinutes min "
                    } else {
                        "$convertedTime$elapsedMinutes mins "
                    }
                }
                convertedTime = (prefix + convertedTime).trim { it <= ' ' }
            } else {
                convertedTime = "Expired"
            }
        } catch (e: ParseException) {
            e.printStackTrace()
            Log.e("convertedTime", e.message!!)
        }
        return convertedTime
    }


    fun getElapsedMinutes(
        endDate: String?,
        inputPattern: String?): Int {
        try {


            val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
            val endTime = inputFormat.parse(endDate)
            val nowTime = Date()
            var dateDiff = endTime.time - nowTime!!.time
            //long different = endDate.getTime() - startDate.getTime();
            if (dateDiff > 0) {
                val secondsInMilli: Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24
                val elapsedDays = (dateDiff / daysInMilli).toInt()
                dateDiff = dateDiff % daysInMilli
                val elapsedHours = (dateDiff / hoursInMilli).toInt()
                dateDiff = dateDiff % hoursInMilli
                var elapsedMinutes = (dateDiff / minutesInMilli).toInt()
                dateDiff = dateDiff % minutesInMilli
                val elapsedSeconds = (dateDiff / secondsInMilli).toInt()
                dateDiff = dateDiff % minutesInMilli
                if(elapsedSeconds>0){
                    elapsedMinutes = elapsedMinutes+1
                }
                return elapsedMinutes

            } else {
                return -1
            }
        } catch (e: ParseException) {
            e.printStackTrace()
            Log.e("convertedTime", e.message!!)
        }
        return 0
    }



    fun getTimeDifferenceInMilli(startDate: String?, inputPattern: String?): Long {
        var difference: Long = 0
        try {

            val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
            val startTime = inputFormat.parse(startDate)
            val nowTime = Date()
            val dateDiff = startTime.time - nowTime!!.time
            difference = if (dateDiff > 0) {
                dateDiff
            } else {
                0
            }
        } catch (e: ParseException) {
            e.printStackTrace()
            Log.e("convertedTime", e.message!!)
        }
        return difference
    }
}