package com.google.android.apps.youtube.embeddedplayer.service.context;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.alta;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private final ClassLoader a;

    public a(ClassLoader classLoader) {
        alta.A(classLoader, "remoteClassLoader cannot be null");
        this.a = classLoader;
    }

    public final View a(String str, Context context, AttributeSet attributeSet) {
        try {
            return (View) this.a.loadClass(str).asSubclass(View.class).getConstructor(b.a).newInstance(context, attributeSet);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
