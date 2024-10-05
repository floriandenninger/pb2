package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;
import defpackage.ajkl;
import defpackage.ajkm;
import defpackage.ajlq;
import defpackage.ajlr;
import defpackage.ajlu;
import defpackage.ammv;
import defpackage.apdb;
import defpackage.avgg;
import defpackage.cnv;
import defpackage.cnx;
import defpackage.coc;
import defpackage.col;
import defpackage.cpu;
import defpackage.cpw;
import defpackage.csk;
import defpackage.cud;
import defpackage.cuh;
import defpackage.cul;
import defpackage.cvo;
import defpackage.cwo;
import defpackage.cxu;
import defpackage.dau;
import defpackage.dav;
import defpackage.dbx;
import defpackage.dcz;
import defpackage.did;
import defpackage.tch;
import defpackage.tci;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final GlideLoaderModule a = new GlideLoaderModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* bridge */ /* synthetic */ dav a() {
        return new dau(1);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.emptySet();
    }

    @Override // defpackage.dbe, defpackage.dbf
    public final void c(Context context, coc cocVar) {
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        ajlq ajlqVar = glideLoaderModule.a;
        dbx dbxVar = (dbx) new dbx().w(cxu.c);
        context.getClass();
        if (((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() < 256) {
            dbxVar = (dbx) dbxVar.v();
        }
        if (((ActivityManager) context.getSystemService("activity")).isLowRamDevice()) {
            dbxVar = (dbx) dbxVar.z(cpw.PREFER_RGB_565);
        }
        if (((apdb) ajlqVar.b.get()).o) {
            dbxVar = (dbx) dbxVar.u(csk.a);
            cocVar.g = new cud();
        } else {
            cocVar.g = new cuh(context);
        }
        if (((apdb) ajlqVar.b.get()).p) {
            dbxVar = (dbx) dbxVar.J(new dcz(String.valueOf(System.currentTimeMillis())));
        }
        cnx cnxVar = new cnx(dbxVar);
        did.ap(cnxVar);
        cocVar.h = cnxVar;
        cocVar.k = true;
        cul culVar = new cul(context);
        did.aq(true, "Low memory max size multiplier must be between 0 and 1");
        culVar.e = 0.1f;
        culVar.b(2.0f);
        culVar.a(2.0f);
        cocVar.n = culVar.c();
        ammv ammvVar = ajlqVar.d;
    }

    @Override // defpackage.dbh, defpackage.dbi
    public final void d(Context context, cnv cnvVar, col colVar) {
        colVar.i(InputStream.class, FrameSequenceDrawable.class, new tci(cnvVar.a));
        colVar.i(ByteBuffer.class, FrameSequenceDrawable.class, new tch(cnvVar.a));
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        ajlq ajlqVar = glideLoaderModule.a;
        apdb apdbVar = (apdb) ajlqVar.b.get();
        colVar.n(cvo.class, InputStream.class, new cpu(ajlqVar.a, 0));
        colVar.j(cvo.class, ByteBuffer.class, new cpu(ajlqVar.a, 1));
        if (apdbVar.l) {
            ajlu ajluVar = (ajlu) ajlqVar.c.get();
            colVar.j(cvo.class, InputStream.class, new ajlr(ajluVar, 0));
            colVar.j(cvo.class, ByteBuffer.class, new ajlr(ajluVar, 1));
        }
        colVar.n(avgg.class, InputStream.class, new cwo(3));
        colVar.i(InputStream.class, byte[].class, new ajkm(cnvVar.d));
        colVar.i(ByteBuffer.class, byte[].class, new ajkl());
    }

    @Override // defpackage.dbe
    public final boolean e() {
        return false;
    }
}
