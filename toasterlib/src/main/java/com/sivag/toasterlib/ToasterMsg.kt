package com.sivag.toasterlib

import android.content.Context
import android.widget.Toast




/**
 * Created by Siva G Gurusamy on 11/Oct/2022
 * email : sivaguru3161@gmail.com
 */

object ToasterMsg {
    fun myToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}