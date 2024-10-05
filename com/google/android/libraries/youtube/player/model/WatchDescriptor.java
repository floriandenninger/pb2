package com.google.android.libraries.youtube.player.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afxg;
import defpackage.aifz;
import defpackage.aigo;
import defpackage.aone;
import defpackage.owi;
import defpackage.owl;
import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WatchDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(0);
    public final PlaybackStartDescriptor a;
    public final aone b;

    public WatchDescriptor(aone aoneVar) {
        aoneVar.getClass();
        aifz d = PlaybackStartDescriptor.d();
        owi owiVar = ((owl) aoneVar.instance).c;
        d.m = owiVar == null ? owi.a : owiVar;
        this.a = d.a();
        this.b = aoneVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116 A[Catch: ParseException -> 0x011a, TRY_LEAVE, TryCatch #0 {ParseException -> 0x011a, blocks: (B:6:0x000f, B:10:0x0085, B:12:0x008d, B:14:0x00a4, B:16:0x00b8, B:17:0x00c7, B:18:0x010f, B:20:0x0116, B:23:0x00fd, B:24:0x001c, B:26:0x0024, B:27:0x0028, B:29:0x0030, B:30:0x0036, B:32:0x0042, B:33:0x0048, B:35:0x0054, B:36:0x005a, B:38:0x0072, B:40:0x007d), top: B:5:0x000f }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.libraries.youtube.player.model.WatchDescriptor a(android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.model.WatchDescriptor.a(android.content.Intent):com.google.android.libraries.youtube.player.model.WatchDescriptor");
    }

    @Deprecated
    public static final WatchDescriptor b(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            String[] stringArray = extras.getStringArray("android.intent.extra.inventory_identifier");
            if (stringArray != null && stringArray.length == 1) {
                afxg a = afxg.a(Uri.parse(stringArray[0]));
                aifz d = PlaybackStartDescriptor.d();
                d.c(a.a);
                d.k = a.b;
                return new WatchDescriptor(d.a());
            }
        } catch (ParseException unused) {
        }
        return null;
    }

    public final void c(Bundle bundle) {
        boolean z = bundle.getBoolean("finish_on_ended", false);
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owlVar.b |= 2;
        owlVar.d = z;
        d(bundle.getBoolean("force_fullscreen", false));
        h();
        f(bundle.getBoolean("skip_remote_route_dialog", false));
        boolean z2 = bundle.getBoolean("is_loopback", false);
        e(z2);
        aone aoneVar2 = this.b;
        aoneVar2.copyOnWrite();
        owl owlVar3 = (owl) aoneVar2.instance;
        owlVar3.b |= 64;
        owlVar3.i = !z2;
    }

    public final void d(boolean z) {
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owlVar.b |= 4;
        owlVar.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(boolean z) {
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owlVar.b |= 32;
        owlVar.h = z;
    }

    public final void f(boolean z) {
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owlVar.b |= 16;
        owlVar.g = z;
    }

    public final boolean g() {
        return ((owl) this.b.instance).i;
    }

    public final void h() {
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owlVar.b |= 8;
        owlVar.f = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aone aoneVar = this.b;
        owi owiVar = this.a.a;
        aoneVar.copyOnWrite();
        owl owlVar = (owl) aoneVar.instance;
        owl owlVar2 = owl.a;
        owiVar.getClass();
        owlVar.c = owiVar;
        owlVar.b |= 1;
        parcel.writeByteArray(((owl) this.b.build()).toByteArray());
    }

    public WatchDescriptor(PlaybackStartDescriptor playbackStartDescriptor) {
        this.b = owl.a.createBuilder();
        playbackStartDescriptor.getClass();
        this.a = playbackStartDescriptor;
    }
}
