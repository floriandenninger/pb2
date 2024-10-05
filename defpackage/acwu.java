package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acwu implements rpl {
    public static final /* synthetic */ acwu a = new acwu(0);
    private final /* synthetic */ int b;

    public /* synthetic */ acwu(int i) {
        this.b = i;
    }

    @Override // defpackage.rpl
    public final void c(Exception exc) {
        if (this.b != 0) {
            afsi.c(1, 12, "Failed to commit to snapshot for Mendel package com.youtube.mainapp.android", exc);
        } else {
            zga.f(acwv.a, "error updating Google Play Services for Cast sdk", exc);
        }
    }
}
