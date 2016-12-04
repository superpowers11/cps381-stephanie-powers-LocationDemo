//package com.example.android.locationdemo;
//
//import android.support.v4.app.ActivityCompat;
//import android.content.pm.PackageManager;
//import android.location.Location;
//
///**
// * Created by stephaniepowers on 12/1/16.
// */
//
//public class OnRequestLocationPermission implements ActivityCompat.OnRequestPermissionsResultCallback {
//
//    private static int REQUEST_LOCATION = 1;
//
//    public void onRequestPermissionsResult(int requestCode,
//                                           String[] permissions,
//                                           int[] grantResults) {
//        if (requestCode == REQUEST_LOCATION) {
//            if(grantResults.length == 1
//                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                // We can now safely use the API we requested access to
////                Location myLocation =
////                        LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
//            } else {
//                // Permission was denied or request was cancelled
//            }
//        }
//    }
//}
