package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatActionEndpointOuterClass$LiveChatActionEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abim implements aaha {
    public final abge a;
    public final zaw b;
    public final Executor c;
    private final aazg d;
    private final /* synthetic */ int e;

    public abim(aazg aazgVar, abge abgeVar, zaw zawVar, Executor executor, int i, byte[] bArr) {
        this.e = i;
        aazgVar.getClass();
        this.d = aazgVar;
        abgeVar.getClass();
        this.a = abgeVar;
        zawVar.getClass();
        this.b = zawVar;
        this.c = executor;
    }

    public abim(aazg aazgVar, abge abgeVar, zaw zawVar, Executor executor, int i) {
        this.e = i;
        aazgVar.getClass();
        this.d = aazgVar;
        abgeVar.getClass();
        this.a = abgeVar;
        zawVar.getClass();
        this.b = zawVar;
        this.c = executor;
    }

    public abim(aazg aazgVar, abge abgeVar, zaw zawVar, Executor executor, int i, char[] cArr) {
        this.e = i;
        aazgVar.getClass();
        this.d = aazgVar;
        abgeVar.getClass();
        this.a = abgeVar;
        zawVar.getClass();
        this.b = zawVar;
        this.c = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        int i = this.e;
        if (i == 0) {
            aazg aazgVar = this.d;
            aazh aazhVar = new aazh(aazgVar.f, aazgVar.a.c(), null, null, null);
            aazhVar.a = ((ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint) apxfVar.pX(ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.manageLiveChatUserEndpoint)).b;
            aazhVar.l(apxfVar.c);
            ynm.k(aazgVar.h.b(aazhVar, angq.a), this.c, new gto(this.b, 3), new ynl() { // from class: abil
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    abgd abgdVar;
                    abim abimVar = abim.this;
                    Map map2 = map;
                    aruv aruvVar = (aruv) obj;
                    if (aruvVar.c.size() > 0) {
                        Object obj2 = map2.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                        if (obj2 instanceof abij) {
                            abgdVar = ((abij) obj2).d();
                        } else {
                            abgdVar = obj2 instanceof abgd ? (abgd) obj2 : null;
                        }
                        if (abgdVar == null) {
                            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                            afsi.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
                        } else {
                            abimVar.a.a(aruvVar.c, abgdVar, true);
                        }
                    }
                }
            });
            return;
        }
        final byte[] bArr = null;
        if (i == 1) {
            aazg aazgVar2 = this.d;
            aayz aayzVar = new aayz(aazgVar2.f, aazgVar2.a.c(), null, null, null);
            aayzVar.a = ((LiveChatActionEndpointOuterClass$LiveChatActionEndpoint) apxfVar.pX(LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.liveChatActionEndpoint)).b;
            aayzVar.l(apxfVar.c);
            ynm.k(aazgVar2.i.b(aayzVar, angq.a), this.c, new gto(this.b, 2), new ynl(map, bArr) { // from class: abii
                public final /* synthetic */ Map a;

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    abgd abgdVar;
                    abim abimVar = abim.this;
                    Map map2 = this.a;
                    artx artxVar = (artx) obj;
                    if (artxVar.c.size() > 0) {
                        Object obj2 = map2.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                        if (obj2 instanceof abij) {
                            abgdVar = ((abij) obj2).d();
                        } else {
                            abgdVar = obj2 instanceof abgd ? (abgd) obj2 : null;
                        }
                        if (abgdVar == null) {
                            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                            afsi.b(2, 31, valueOf.length() != 0 ? "Live chat action command called with no context. \n".concat(valueOf) : new String("Live chat action command called with no context. \n"));
                        } else {
                            abimVar.a.a(artxVar.c, abgdVar, true);
                        }
                    }
                }
            });
            return;
        }
        aazg aazgVar3 = this.d;
        aazk aazkVar = new aazk(aazgVar3.f, aazgVar3.a.c(), null, null, null);
        aazkVar.a = ((SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint) apxfVar.pX(SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.sendLiveChatVoteEndpoint)).b;
        aazkVar.l(apxfVar.c);
        ynm.k(aazgVar3.j.b(aazkVar, angq.a), this.c, new ynk(map, bArr) { // from class: abir
            public final /* synthetic */ Map a;

            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(final Throwable th) {
                final abim abimVar = abim.this;
                final Map map2 = this.a;
                final byte[] bArr2 = null;
                abimVar.c.execute(new Runnable(map2, th, bArr2) { // from class: abit
                    public final /* synthetic */ Map a;
                    public final /* synthetic */ Throwable b;

                    @Override // java.lang.Runnable
                    public final void run() {
                        abim abimVar2 = abim.this;
                        Map map3 = this.a;
                        Throwable th2 = this.b;
                        if (map3 == null || !map3.containsKey("live_chat_poll_error_listener_key")) {
                            return;
                        }
                        Object obj = map3.get("live_chat_poll_error_listener_key");
                        if (obj instanceof abgn) {
                            ((abgn) obj).a(abimVar2.b.b(th2));
                        }
                    }
                });
            }
        }, new ynl(map, bArr) { // from class: abis
            public final /* synthetic */ Map a;

            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                abim abimVar = abim.this;
                Map map2 = this.a;
                arue arueVar = (arue) obj;
                if (arueVar.c.size() > 0) {
                    abgd abgdVar = (abgd) yjj.u(map2, "com.google.android.libraries.youtube.innertube.endpoint.tag", abgd.class);
                    if (abgdVar == null) {
                        String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                        afsi.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
                    } else {
                        abimVar.a.a(arueVar.c, abgdVar, true);
                    }
                }
            }
        });
    }
}
