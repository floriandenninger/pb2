package com.google.android.apps.youtube.embeddedplayer.service.context;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import defpackage.alta;
import defpackage.iq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ContextWrapper {
    public static final Class[] a = {Context.class, AttributeSet.class};
    private final Resources b;
    private LayoutInflater c;
    private final Resources.Theme d;
    private final AssetManager e;

    private b(Context context, Resources resources, Resources.Theme theme) {
        super(context);
        alta.A(resources, "resources cannot be null");
        this.b = resources;
        alta.A(theme, "theme cannot be null");
        this.d = theme;
        this.e = resources.getAssets();
    }

    public static b a(Context context, Resources resources, ClassLoader classLoader, Resources.Theme theme) {
        b bVar = new b(context, resources, theme);
        LayoutInflater cloneInContext = ((LayoutInflater) super.getSystemService("layout_inflater")).cloneInContext(bVar);
        cloneInContext.setFactory2(new iq(new a(classLoader)));
        bVar.c = cloneInContext;
        return bVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "layout_inflater".equals(str) ? this.c : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.d;
    }
}
