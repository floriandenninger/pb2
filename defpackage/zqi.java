package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zqi implements PacketCallback {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public ammv c = amlr.a;
    public final Object d = new Object();
    private final Context e;

    public zqi(Context context) {
        this.e = context.getApplicationContext();
    }

    @Override // com.google.mediapipe.framework.PacketCallback
    public final void process(Packet packet) {
        String str;
        byte[] nativeGetProtoBytes = PacketGetter.nativeGetProtoBytes(packet.getNativeHandle());
        aony<axdd> aonyVar = null;
        if (nativeGetProtoBytes == null) {
            zga.b("Null byte[] from packet");
        } else {
            try {
                axdh axdhVar = (axdh) aonm.parseFrom(axdh.a, nativeGetProtoBytes, aomw.b());
                if (axdhVar.b.size() == 0) {
                    zga.b("No output events");
                } else {
                    aonyVar = axdhVar.b;
                }
            } catch (aoob e) {
                zga.d("Error parsing bytes from packet", e);
            }
        }
        if (aonyVar == null || aonyVar.isEmpty()) {
            return;
        }
        for (axdd axddVar : aonyVar) {
            if (axddVar.o()) {
                axdu g = axddVar.g();
                if (g.g()) {
                    str = zoz.f;
                } else {
                    str = zoz.e;
                }
                synchronized (this.d) {
                    if (this.c.h()) {
                        str = (String) this.c.c();
                    }
                }
                aone builder = g.toBuilder();
                builder.copyOnWrite();
                ((axdu) builder.instance).h();
                new zqh(this, (axdu) builder.build(), new File(this.e.getCacheDir(), str), g).execute(new Void[0]);
            }
            if (axddVar.m()) {
                boolean c = axddVar.e().c();
                synchronized (this.d) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((zqj) it.next()).h(true, c);
                    }
                }
            }
            if (axddVar.n()) {
                synchronized (this.d) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        ((zqj) it2.next()).h(false, false);
                    }
                }
            }
            if (axddVar.l()) {
                synchronized (this.d) {
                    Iterator it3 = this.b.iterator();
                    while (it3.hasNext()) {
                        ((zqj) it3.next()).g(true);
                    }
                }
            }
            if (axddVar.p()) {
                synchronized (this.d) {
                    Iterator it4 = this.b.iterator();
                    while (it4.hasNext()) {
                        ((zqj) it4.next()).g(false);
                    }
                }
            }
            if (axddVar.i()) {
                synchronized (this.d) {
                    for (zqj zqjVar : this.b) {
                        if (axddVar.b().a() == axcf.ADD_STICKER) {
                            zqjVar.m(axddVar.b().d());
                        } else if (axddVar.b().a() == axcf.ADD_TEXT) {
                            zqjVar.n(axddVar.b().d());
                        }
                    }
                }
            }
            if (axddVar.h()) {
                synchronized (this.d) {
                    Iterator it5 = this.b.iterator();
                    while (it5.hasNext()) {
                        ((zqj) it5.next()).f(axddVar.f());
                    }
                }
            }
            if (axddVar.j()) {
                synchronized (this.d) {
                    Iterator it6 = this.b.iterator();
                    while (it6.hasNext()) {
                        ((zqj) it6.next()).d(axddVar.a());
                    }
                }
            }
            if (axddVar.k()) {
                synchronized (this.d) {
                    Iterator it7 = this.b.iterator();
                    while (it7.hasNext()) {
                        ((zqj) it7.next()).e(axddVar.c());
                    }
                }
            }
        }
    }
}
