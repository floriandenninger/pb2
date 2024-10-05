package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.d;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.alta;
import defpackage.alvc;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alvs;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alvc extends ecq implements IInterface {
    protected final ahxn A;
    protected final ahya B;
    protected final f C;
    public final Context D;
    public final zbg E;
    public final a F;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.a G;
    public final k H;
    public final c I;

    /* renamed from: J, reason: collision with root package name */
    protected final azrr f68J;
    public alvl K;
    public boolean L;
    protected final b M;
    protected final e N;
    public alvi O;
    public alvh P;
    public alvg Q;
    protected rql R;
    private al a;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.b b;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b c;
    private boolean d;
    private int e;
    public final Handler h;
    protected final FrameLayout i;
    public final aivi j;
    protected final ahvr k;
    protected final ahxo l;
    protected final ahys m;
    protected final ahxc n;
    protected final h o;
    protected final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b p;
    protected final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c q;
    protected final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b r;
    protected final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b s;
    protected final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b t;
    public ak u;
    protected j v;
    protected ahyz w;
    protected final n x;
    protected final xie y;
    protected final ahwj z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:3)(1:69)|4|(2:5|6)|(15:(1:8)(3:63|64|(19:66|10|11|12|13|(3:54|55|56)(1:17)|18|19|20|(1:22)|23|25|26|27|(1:29)|30|(2:46|(1:48))(6:34|(1:36)|37|(1:39)|40|(1:42))|43|44))|19|20|(0)|23|25|26|27|(0)|30|(1:32)|46|(0)|43|44)|9|10|11|12|13|(1:15)|54|55|56|18|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:1|(1:3)(1:69)|4|5|6|(1:8)(3:63|64|(19:66|10|11|12|13|(3:54|55|56)(1:17)|18|19|20|(1:22)|23|25|26|27|(1:29)|30|(2:46|(1:48))(6:34|(1:36)|37|(1:39)|40|(1:42))|43|44))|9|10|11|12|13|(1:15)|54|55|56|18|19|20|(0)|23|25|26|27|(0)|30|(1:32)|46|(0)|43|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x032b, code lost:
    
        defpackage.alta.C("Cannot load paid content UI. Upgrade to the latest version of the Android YouTube API.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f4, code lost:
    
        defpackage.alta.C("Cannot load modern controls UI. Upgrade to the latest version of the Android YouTube API.", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02f9 A[Catch: RuntimeException -> 0x03ad, TryCatch #2 {RuntimeException -> 0x03ad, blocks: (B:20:0x02df, B:22:0x02f9, B:23:0x0300), top: B:19:0x02df }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0386  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public alvc(android.content.Context r12, com.google.android.apps.youtube.embeddedplayer.service.jar.a r13, defpackage.aivi r14) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvc.<init>(android.content.Context, com.google.android.apps.youtube.embeddedplayer.service.jar.a, aivi):void");
    }

    protected abstract boolean A();

    public abstract boolean B();

    protected abstract boolean C();

    public abstract boolean D(VisibilityChangeEventData visibilityChangeEventData);

    protected abstract boolean E(int i, KeyEvent keyEvent);

    protected abstract boolean F(int i, KeyEvent keyEvent);

    protected abstract boolean G(byte[] bArr);

    protected abstract byte[] H();

    public final int I() {
        L();
        return this.c.a();
    }

    public final alvv J() {
        return alvu.a(this.i);
    }

    public final void K(int i) {
        L();
        this.c.f(i | I());
    }

    protected final void L() {
        if (!au()) {
            throw new IllegalStateException("This YouTubePlayer has been released");
        }
    }

    public final void M() {
        if (au()) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
            bVar.p = false;
            bVar.e();
        }
    }

    public final void N() {
        if (au()) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
            bVar.p = true;
            bVar.e();
            k(acsb.c(28666));
            k(acsb.c(23851));
        }
    }

    public final void P() {
        if (au()) {
            this.H.h();
        }
    }

    public final void Q() {
        if (au()) {
            this.H.g();
        }
    }

    public final void R() {
        if (au()) {
            this.c.g(true);
        }
    }

    public final void S() {
        if (au()) {
            this.c.g(false);
        }
    }

    public final void T() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 1));
    }

    public final void U(boolean z) {
        this.h.post(new d(this, z, 1));
    }

    public final void V(boolean z) {
        this.h.post(new d(this, z, 0));
    }

    public final void W(final String str) {
        this.h.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.c
            @Override // java.lang.Runnable
            public final void run() {
                alvc alvcVar = alvc.this;
                String str2 = str;
                alvi alviVar = alvcVar.O;
                if (alviVar == null || !alvcVar.au()) {
                    return;
                }
                try {
                    Parcel pn = alviVar.pn();
                    pn.writeString(str2);
                    alviVar.pp(2, pn);
                } catch (RemoteException e) {
                    throw new alvs(e);
                }
            }
        });
    }

    public final void X() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 0));
    }

    public final void Y() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 2));
    }

    public final void Z() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 3));
    }

    protected abstract int a();

    public final void aA(String str) {
        ak akVar = this.u;
        if (akVar != null) {
            akVar.N(str);
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.b bVar = this.b;
        if (bVar != null) {
            bVar.b.d.c.setText(str);
        }
    }

    public final void aa() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 4));
    }

    public final void ab() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 5));
    }

    public final void ac() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 6));
    }

    public final void ad(final long j) {
        this.h.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.a
            @Override // java.lang.Runnable
            public final void run() {
                alvc alvcVar = alvc.this;
                long j2 = j;
                alvh alvhVar = alvcVar.P;
                if (alvhVar == null || !alvcVar.au()) {
                    return;
                }
                int i = (int) j2;
                try {
                    Parcel pn = alvhVar.pn();
                    pn.writeInt(i);
                    alvhVar.pp(5, pn);
                } catch (RemoteException e) {
                    throw new alvs(e);
                }
            }
        });
    }

    public final void ae() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 7));
    }

    public final void af() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 8));
    }

    public final void ag() {
        this.h.post(new com.google.android.apps.youtube.embeddedplayer.service.jar.client.e(this, 9));
    }

    public final void ah() {
        if (au()) {
            m(this.F.e());
        }
    }

    public final void ai() {
        if (au()) {
            n();
        }
    }

    public final void aj() {
        if (au()) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
            if (!bVar.g || bVar.l) {
                return;
            }
            bVar.q.a(true);
        }
    }

    public final void ak() {
        if (au()) {
            this.L = false;
            this.G.dismiss();
        }
    }

    public final void al(boolean z) {
        if (au()) {
            this.d = true;
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
            bVar.o.i();
            bVar.c.disable();
            bVar.f = false;
            this.H.f();
            this.K = null;
            this.O = null;
            this.P = null;
            this.Q = null;
            r(z);
        }
    }

    public final void am(boolean z) {
        L();
        u(z);
    }

    public final void an(String str) {
        char c;
        al alVar;
        int hashCode = str.hashCode();
        int i = 2;
        if (hashCode == -2032180703) {
            if (str.equals("DEFAULT")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1023831277) {
            if (hashCode == 1782520193 && str.equals("MINIMAL")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("CHROMELESS")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 1;
        } else if (c != 1) {
            if (c != 2) {
                throw new IllegalArgumentException();
            }
            i = 3;
        }
        L();
        ak akVar = this.u;
        if (akVar != null && (alVar = this.a) != null) {
            int i2 = i - 1;
            if (i2 == 0) {
                ((FrameLayout) akVar.ld()).setVisibility(0);
                alVar.setVisibility(8);
                this.j.setFocusable(true);
            } else if (i2 != 1) {
                ((FrameLayout) akVar.ld()).setVisibility(8);
                alVar.setVisibility(0);
                alVar.B(true);
                this.j.setFocusable(false);
            } else {
                ((FrameLayout) akVar.ld()).setVisibility(8);
                alVar.setVisibility(0);
                alVar.B(false);
                this.j.setFocusable(true);
            }
            this.e = i;
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.b bVar = this.b;
        if (bVar != null) {
            int i3 = i - 1;
            if (i3 == 0) {
                bVar.D(false);
                this.b.C(false);
                this.j.setFocusable(true);
            } else if (i3 != 1) {
                bVar.C(true);
                this.j.setFocusable(false);
            } else {
                bVar.D(true);
                this.b.C(false);
                this.j.setFocusable(true);
            }
        }
        this.e = i;
    }

    public final void ao(alvl alvlVar) {
        L();
        this.K = alvlVar;
    }

    public final void ap(boolean z) {
        L();
        w(z);
    }

    public final void aq() {
        L();
        x();
    }

    public final void ar() {
        L();
        y();
    }

    public final boolean as() {
        L();
        return z();
    }

    public final boolean at() {
        L();
        return A();
    }

    public final boolean au() {
        return !this.d;
    }

    public final boolean av() {
        L();
        return C();
    }

    public final boolean aw(int i, KeyEvent keyEvent) {
        if (au()) {
            return E(i, keyEvent);
        }
        return false;
    }

    public final boolean ax(int i, KeyEvent keyEvent) {
        if (au()) {
            return F(i, keyEvent);
        }
        return false;
    }

    public final void ay(int i) {
        if (au() && av()) {
            ar();
            this.H.c();
            az(i);
        }
    }

    public final void az(final int i) {
        this.h.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.b
            @Override // java.lang.Runnable
            public final void run() {
                alvc alvcVar = alvc.this;
                int i2 = i;
                alvi alviVar = alvcVar.O;
                if (alviVar == null || !alvcVar.au()) {
                    return;
                }
                try {
                    alviVar.a(alta.D(i2));
                } catch (RemoteException e) {
                    throw new alvs(e);
                }
            }
        });
    }

    protected abstract int b();

    public abstract void c();

    protected abstract void d(String str, int i, int i2);

    protected abstract void e(String str, int i);

    protected abstract void f(List list, int i, int i2);

    public abstract void g();

    protected abstract void h(String str, int i, int i2);

    protected abstract void i(String str, int i);

    protected abstract void j(List list, int i, int i2);

    protected abstract void k(acsc acscVar);

    protected abstract void l();

    protected abstract void m(boolean z);

    protected abstract void n();

    protected abstract void o();

    protected abstract void p();

    protected abstract void q();

    protected abstract void r(boolean z);

    protected abstract void s(int i);

    protected abstract void t(int i);

    protected abstract void u(boolean z);

    protected abstract void v(boolean z);

    protected abstract void w(boolean z);

    protected abstract void x();

    protected abstract void y();

    protected abstract boolean z();

    public final void O(boolean z) {
        boolean z2;
        if (au()) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
            bVar.g = z;
            if (!z) {
                bVar.m = false;
                if (bVar.j) {
                    if (!bVar.k) {
                        bVar.c.disable();
                    }
                    if (bVar.i()) {
                        bVar.h(bVar.i);
                    }
                }
                if (bVar.n) {
                    bVar.o.g();
                }
                if (bVar.l) {
                    return;
                }
                bVar.q.a(false);
                return;
            }
            if (bVar.j) {
                z2 = bVar.a.getResources().getConfiguration().orientation != 2;
                bVar.h(6);
                zas zasVar = bVar.c;
                if (!zasVar.a) {
                    zasVar.enable();
                }
            } else {
                z2 = false;
            }
            if (bVar.n) {
                if (z2) {
                    bVar.m = true;
                } else {
                    bVar.m = false;
                    bVar.d();
                }
            }
            if (bVar.l) {
                return;
            }
            if (z2 && bVar.d) {
                return;
            }
            bVar.q.a(true);
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alvg alvgVar = null;
        Bundle bundle = null;
        alvh alvhVar = null;
        alvi alviVar = null;
        alvl alvlVar = null;
        boolean z = false;
        switch (i) {
            case 1:
                al(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                L();
                e(readString, readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                L();
                i(readString2, readInt2);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                L();
                d(readString3, readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString4 = parcel.readString();
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                L();
                h(readString4, readInt5, readInt6);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                L();
                f(createStringArrayList, readInt7, readInt8);
                parcel2.writeNoException();
                return true;
            case 7:
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                L();
                j(createStringArrayList2, readInt9, readInt10);
                parcel2.writeNoException();
                return true;
            case 8:
                L();
                p();
                parcel2.writeNoException();
                return true;
            case 9:
                L();
                o();
                parcel2.writeNoException();
                return true;
            case 10:
                boolean av = av();
                parcel2.writeNoException();
                ecr.e(parcel2, av);
                return true;
            case 11:
                boolean as = as();
                parcel2.writeNoException();
                ecr.e(parcel2, as);
                return true;
            case 12:
                boolean at = at();
                parcel2.writeNoException();
                ecr.e(parcel2, at);
                return true;
            case 13:
                L();
                if (!as()) {
                    throw new NoSuchElementException("Called next at end of playlist");
                }
                l();
                parcel2.writeNoException();
                return true;
            case 14:
                L();
                if (!at()) {
                    throw new NoSuchElementException("Called previous at start of playlist");
                }
                q();
                parcel2.writeNoException();
                return true;
            case 15:
                L();
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 16:
                L();
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 17:
                int readInt11 = parcel.readInt();
                L();
                t(readInt11);
                parcel2.writeNoException();
                return true;
            case 18:
                int readInt12 = parcel.readInt();
                L();
                s(readInt12);
                parcel2.writeNoException();
                return true;
            case 19:
                am(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 20:
                int readInt13 = parcel.readInt();
                L();
                this.c.f(readInt13);
                parcel2.writeNoException();
                return true;
            case 21:
                int I = I();
                parcel2.writeNoException();
                parcel2.writeInt(I);
                return true;
            case 22:
                K(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 23:
                an(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 24:
                ap(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 25:
                boolean j = ecr.j(parcel);
                L();
                v(j);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    if (queryLocalInterface instanceof alvg) {
                        alvgVar = (alvg) queryLocalInterface;
                    } else {
                        alvgVar = new alvg(readStrongBinder);
                    }
                }
                L();
                this.Q = alvgVar;
                parcel2.writeNoException();
                return true;
            case 27:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    if (queryLocalInterface2 instanceof alvl) {
                        alvlVar = (alvl) queryLocalInterface2;
                    } else {
                        alvlVar = new alvj(readStrongBinder2);
                    }
                }
                ao(alvlVar);
                parcel2.writeNoException();
                return true;
            case 28:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    if (queryLocalInterface3 instanceof alvi) {
                        alviVar = (alvi) queryLocalInterface3;
                    } else {
                        alviVar = new alvi(readStrongBinder3);
                    }
                }
                L();
                this.O = alviVar;
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    if (queryLocalInterface4 instanceof alvh) {
                        alvhVar = (alvh) queryLocalInterface4;
                    } else {
                        alvhVar = new alvh(readStrongBinder4);
                    }
                }
                L();
                this.P = alvhVar;
                parcel2.writeNoException();
                return true;
            case 30:
                ar();
                parcel2.writeNoException();
                return true;
            case 31:
                aq();
                parcel2.writeNoException();
                return true;
            case 32:
                Configuration configuration = (Configuration) ecr.a(parcel, Configuration.CREATOR);
                if (au()) {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar = this.c;
                    if (configuration.orientation != bVar.e) {
                        bVar.e = configuration.orientation;
                        int i3 = configuration.orientation;
                        if (bVar.g && bVar.j && i3 == 1) {
                            bVar.q.b(false);
                        } else if (bVar.n && bVar.m && i3 != 1) {
                            bVar.d();
                        }
                        bVar.m = false;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 33:
                aj();
                parcel2.writeNoException();
                return true;
            case 34:
                ai();
                parcel2.writeNoException();
                return true;
            case 35:
                ah();
                parcel2.writeNoException();
                return true;
            case 36:
                ak();
                parcel2.writeNoException();
                return true;
            case 37:
                al(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                alvi alviVar2 = this.O;
                if (alviVar2 != null && !this.d) {
                    try {
                        alviVar2.a("UNEXPECTED_SERVICE_DISCONNECTION");
                    } catch (RemoteException e) {
                        throw new alvs(e);
                    }
                }
                al(true);
                parcel2.writeNoException();
                return true;
            case 39:
                if (au()) {
                    Bundle bundle2 = new Bundle();
                    int i4 = this.e;
                    String str = i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "CHROMELESS" : "MINIMAL" : "DEFAULT";
                    if (i4 != 0) {
                        bundle2.putString("playerStyle", str);
                        com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar2 = this.c;
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("isFullscreen", bVar2.g);
                        bundle3.putInt("defaultRequestedOrientation", bVar2.i);
                        bundle3.putInt("controlFlags", bVar2.a());
                        bundle2.putBundle("fullscreenHelperState", bundle3);
                        bundle2.putByteArray("apiPlayerState", H());
                        bundle = bundle2;
                    } else {
                        throw null;
                    }
                }
                parcel2.writeNoException();
                ecr.h(parcel2, bundle);
                return true;
            case 40:
                Bundle bundle4 = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                if (au() && bundle4 != null) {
                    String string = bundle4.getString("playerStyle");
                    if (string != null) {
                        an(string);
                    }
                    Bundle bundle5 = bundle4.getBundle("fullscreenHelperState");
                    if (bundle5 != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.b bVar3 = this.c;
                        bVar3.h = true;
                        bVar3.f(bundle5.getInt("controlFlags"));
                        bVar3.i = bundle5.getInt("defaultRequestedOrientation");
                        if (bundle5.getBoolean("isFullscreen")) {
                            bVar3.q.b(true);
                        }
                    }
                    byte[] byteArray = bundle4.getByteArray("apiPlayerState");
                    if (byteArray != null) {
                        z = G(byteArray);
                    }
                }
                parcel2.writeNoException();
                ecr.e(parcel2, z);
                return true;
            case 41:
                boolean aw = aw(parcel.readInt(), (KeyEvent) ecr.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                ecr.e(parcel2, aw);
                return true;
            case 42:
                boolean ax = ax(parcel.readInt(), (KeyEvent) ecr.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                ecr.e(parcel2, ax);
                return true;
            case 43:
                alvv J2 = J();
                parcel2.writeNoException();
                ecr.i(parcel2, J2);
                return true;
            default:
                return false;
        }
    }
}
