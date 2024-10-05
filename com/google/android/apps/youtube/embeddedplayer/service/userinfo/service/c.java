package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class c implements SharedPreferences {
    private final SharedPreferences a;
    private final String b;

    public c(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
    }

    private final String a(String str) {
        return d.e(str, this.b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new b(this.a.edit(), this.b);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.a.getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(a(str), z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return this.a.getFloat(a(str), f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return this.a.getInt(a(str), i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return this.a.getLong(a(str), j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return this.a.getString(a(str), str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return this.a.getStringSet(a(str), set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
