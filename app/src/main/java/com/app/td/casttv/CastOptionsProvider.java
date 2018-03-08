package com.app.td.casttv;

import android.content.Context;

import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.SessionProvider;

import java.util.List;

/**
 * Created by kenkz447 on 3/8/2018.
 */

public class CastOptionsProvider implements OptionsProvider {

    @Override
    public CastOptions getCastOptions(Context context) {
        CastOptions castOptions = new CastOptions.Builder()
                .setReceiverApplicationId(context.getString(R.string.app_id))
                .build();
        return castOptions;
    }

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}