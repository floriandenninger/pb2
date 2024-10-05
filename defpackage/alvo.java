package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.g;
import defpackage.alta;
import defpackage.alvo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvo extends ecq implements alvp {
    public final g a;
    public final e b;
    private final Handler c;

    public alvo(Handler handler, aaxn aaxnVar, ajjz ajjzVar, ysy ysyVar, alvn alvnVar, byte[] bArr, byte[] bArr2) {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
        alvnVar.getClass();
        handler.getClass();
        this.c = handler;
        g gVar = new g(alvnVar);
        this.a = gVar;
        this.b = new e(gVar, aaxnVar, ajjzVar, ysyVar, null, null);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        final int i3 = 1;
        final int i4 = 0;
        switch (i) {
            case 1:
                final String readString = parcel.readString();
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        alvo alvoVar = alvo.this;
                        String str = readString;
                        e eVar = alvoVar.b;
                        eVar.b();
                        if (TextUtils.isEmpty(str)) {
                            eVar.f(3);
                        } else {
                            eVar.c = new d(eVar, str);
                            eVar.c.h();
                        }
                    }
                });
                break;
            case 2:
                final String readString2 = parcel.readString();
                final int readInt = parcel.readInt();
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        alvo alvoVar = alvo.this;
                        String str = readString2;
                        int i5 = readInt;
                        e eVar = alvoVar.b;
                        eVar.b();
                        if (TextUtils.isEmpty(str)) {
                            eVar.f(3);
                        } else {
                            eVar.c = new b(eVar, str, i5);
                            eVar.c.h();
                        }
                    }
                });
                break;
            case 3:
                Handler handler = this.c;
                final e eVar = this.b;
                eVar.getClass();
                handler.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i5 = i4;
                        if (i5 == 0) {
                            e eVar2 = eVar;
                            a aVar = eVar2.c;
                            if (aVar == null || !aVar.j()) {
                                str = true == (eVar2.c instanceof b) ? "as already at the end of the playlist." : "due to no playlist being set.";
                                alta.C(str.length() != 0 ? "Ignoring call to next() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to next() on YouTubeThumbnailView "), new Object[0]);
                                return;
                            } else {
                                eVar2.c.f();
                                return;
                            }
                        }
                        if (i5 == 1) {
                            a aVar2 = eVar.c;
                            if (aVar2 == null) {
                                alta.C("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
                                return;
                            } else {
                                aVar2.e();
                                return;
                            }
                        }
                        e eVar3 = eVar;
                        a aVar3 = eVar3.c;
                        if (aVar3 == null || !aVar3.k()) {
                            str = true == (eVar3.c instanceof b) ? "as already at the start of the playlist." : "due to no playlist being set.";
                            alta.C(str.length() != 0 ? "Ignoring call to previous() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to previous() on YouTubeThumbnailView "), new Object[0]);
                        } else {
                            eVar3.c.g();
                        }
                    }
                });
                break;
            case 4:
                Handler handler2 = this.c;
                final e eVar2 = this.b;
                eVar2.getClass();
                final int i5 = 2;
                handler2.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i52 = i5;
                        if (i52 == 0) {
                            e eVar22 = eVar2;
                            a aVar = eVar22.c;
                            if (aVar == null || !aVar.j()) {
                                str = true == (eVar22.c instanceof b) ? "as already at the end of the playlist." : "due to no playlist being set.";
                                alta.C(str.length() != 0 ? "Ignoring call to next() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to next() on YouTubeThumbnailView "), new Object[0]);
                                return;
                            } else {
                                eVar22.c.f();
                                return;
                            }
                        }
                        if (i52 == 1) {
                            a aVar2 = eVar2.c;
                            if (aVar2 == null) {
                                alta.C("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
                                return;
                            } else {
                                aVar2.e();
                                return;
                            }
                        }
                        e eVar3 = eVar2;
                        a aVar3 = eVar3.c;
                        if (aVar3 == null || !aVar3.k()) {
                            str = true == (eVar3.c instanceof b) ? "as already at the start of the playlist." : "due to no playlist being set.";
                            alta.C(str.length() != 0 ? "Ignoring call to previous() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to previous() on YouTubeThumbnailView "), new Object[0]);
                        } else {
                            eVar3.c.g();
                        }
                    }
                });
                break;
            case 5:
                Handler handler3 = this.c;
                final e eVar3 = this.b;
                eVar3.getClass();
                handler3.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i52 = i3;
                        if (i52 == 0) {
                            e eVar22 = eVar3;
                            a aVar = eVar22.c;
                            if (aVar == null || !aVar.j()) {
                                str = true == (eVar22.c instanceof b) ? "as already at the end of the playlist." : "due to no playlist being set.";
                                alta.C(str.length() != 0 ? "Ignoring call to next() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to next() on YouTubeThumbnailView "), new Object[0]);
                                return;
                            } else {
                                eVar22.c.f();
                                return;
                            }
                        }
                        if (i52 == 1) {
                            a aVar2 = eVar3.c;
                            if (aVar2 == null) {
                                alta.C("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
                                return;
                            } else {
                                aVar2.e();
                                return;
                            }
                        }
                        e eVar32 = eVar3;
                        a aVar3 = eVar32.c;
                        if (aVar3 == null || !aVar3.k()) {
                            str = true == (eVar32.c instanceof b) ? "as already at the start of the playlist." : "due to no playlist being set.";
                            alta.C(str.length() != 0 ? "Ignoring call to previous() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to previous() on YouTubeThumbnailView "), new Object[0]);
                        } else {
                            eVar32.c.g();
                        }
                    }
                });
                break;
            case 6:
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        alvo.this.a.a = null;
                        System.gc();
                    }
                });
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public alvo() {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
    }
}
