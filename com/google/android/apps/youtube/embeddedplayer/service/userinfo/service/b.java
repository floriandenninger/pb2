package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class b implements SharedPreferences.Editor {
    private final SharedPreferences.Editor a;
    private final String b;

    public b(SharedPreferences.Editor editor, String str) {
        this.a = editor;
        this.b = str;
    }

    private final String a(String str) {
        return d.e(str, this.b);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.a.apply();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.a.putBoolean(a(str), z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.a.putFloat(a(str), f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.a.putInt(a(str), i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.a.putLong(a(str), j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        this.a.putString(a(str), str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        this.a.putStringSet(a(str), set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.a.remove(a(str));
        return this;
    }
}
