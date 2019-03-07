//package com.examplsqlitehelper.myappvtg;
//
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.graphics.BitmapFactory;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.mapbox.geojson.Feature;
//import com.mapbox.geojson.Point;
//import com.mapbox.mapboxsdk.Mapbox;
//import com.mapbox.mapboxsdk.maps.MapView;
//import com.mapbox.mapboxsdk.maps.MapboxMap;
//import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
//import com.mapbox.mapboxsdk.maps.Style;
//import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
//import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
//import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
//
//
//public class MapActivity extends AppCompatActivity {
//
//    //    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_map);
////    }
////}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        final Mapbox instance = Mapbox.getInstance( this,getString(R.string.access_token) );
//
//        setContentView(R.layout.home_fragment);
//
//        MapView mapView = (MapView) findViewById(R.id.mapView);
//        mapView.onCreate(savedInstanceState);
//        mapView.getMapAsync(new OnMapReadyCallback() {
//            @Override
//            public void onMapReady(@NonNull MapboxMap mapboxMap) {
//
//                mapboxMap.setStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() {
//                    @Override
//                    public void onStyleLoaded(@NonNull Style style) {
//
//                        // Map is set up and the style has loaded. Now you can add data or make other map adjustments
//                        // Add the marker image to map
//                        style.addImage("marker-icon-id",
//                                BitmapFactory.decodeResource(
//                                        MapActivity.this.getResources(), R.drawable.mapbox_marker_icon_default));
//
//                        @SuppressLint("Range") GeoJsonSource geoJsonSource = new GeoJsonSource("source-id", Feature.fromGeometry(
//                                Point.fromLngLat(123.8938,10.3097)));
//                        style.addSource(geoJsonSource);
//
//                        SymbolLayer symbolLayer = new SymbolLayer("layer-id", "source-id");
//                        symbolLayer.withProperties(
//                                PropertyFactory.iconImage("marker-icon-id")
//                        );
//                        style.addLayer(symbolLayer);
//
//                    }
//                });
//            }
//        });
//    }
//
//
//}
