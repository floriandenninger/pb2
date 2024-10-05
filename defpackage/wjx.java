package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wjx implements wka {
    public final alxe a;
    public final alyw b;
    private final alzf c;
    private final anib d;
    private final Executor e;

    public wjx(alxe alxeVar, alyw alywVar, alzf alzfVar, anib anibVar, Executor executor) {
        this.a = alxeVar;
        this.b = alywVar;
        this.c = alzfVar;
        this.d = anibVar;
        this.e = executor;
    }

    public static /* synthetic */ void a(Throwable th) {
        throw new IllegalStateException("DefaultTikTokBridge: switch account error", th);
    }

    @Override // defpackage.wka
    public final void b(final afsx afsxVar) {
        ynm.j(amka.c(this.c.a()).i(new anfz() { // from class: wjw
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                wjx wjxVar = wjx.this;
                afsx afsxVar2 = afsxVar;
                return wjxVar.b.a(whu.i(afsxVar2), whu.j(afsxVar2));
            }
        }, this.d).i(new anfz() { // from class: wjv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                wjx wjxVar = wjx.this;
                if (((AccountId) obj) != null) {
                    return wjxVar.a.e();
                }
                afsi.b(2, 25, "[Clockwork][DefaultTikTokBridge] notifyRequirementStateChanged: AccountId was null");
                return anaf.N(new IllegalStateException("AccountId was null"));
            }
        }, this.d), this.e, lra.l);
    }
}
