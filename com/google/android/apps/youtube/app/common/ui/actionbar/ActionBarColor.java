package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;
import android.os.Parcelable;
import defpackage.wbs;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ActionBarColor extends Parcelable {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class ColorConstantActionBarColor implements ActionBarColor {
        public abstract int a();

        @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor
        public final int le(Context context) {
            return context.getResources().getColor(a());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class ColorIntActionBarColor implements ActionBarColor {
        public abstract int a();

        @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor
        public final int le(Context context) {
            return a();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class ThemedActionBarColor implements ActionBarColor {
        public abstract int a();

        @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor
        public final int le(Context context) {
            return wbs.W(context, a()).orElse(0);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class TransformAlphaActionBarColor implements ActionBarColor {
        public abstract int a();

        public abstract ActionBarColor b();

        @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor
        public final int le(Context context) {
            return whu.S(b().le(context), a());
        }
    }

    int le(Context context);
}
