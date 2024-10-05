package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytw implements ysc {
    private final azrw a;
    private final ytp b;

    public ytw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ynx ynxVar) {
        ytp ytpVar = new ytp();
        if (azrwVar == null) {
            throw new NullPointerException("Null cronetEngineProvider");
        }
        ytpVar.a = azrwVar;
        if (azrwVar2 != null) {
            ytpVar.c = azrwVar2;
            if (ynxVar != null) {
                ytpVar.d = ynxVar;
                if (azrwVar3 != null) {
                    ytpVar.b = azrwVar3;
                    this.b = ytpVar;
                    this.a = azrwVar;
                    return;
                }
                throw new NullPointerException("Null headerDecoratorProvider");
            }
            throw new NullPointerException("Null commonConfigs");
        }
        throw new NullPointerException("Null uriRewriter");
    }

    @Override // defpackage.ysc
    public final /* synthetic */ yrw a(yry yryVar) {
        azrw azrwVar;
        azrw azrwVar2;
        ynx ynxVar;
        yry yryVar2;
        ytp ytpVar = this.b;
        if (yryVar == null) {
            throw new NullPointerException("Null httpClientConfig");
        }
        ytpVar.e = yryVar;
        azrw azrwVar3 = ytpVar.a;
        if (azrwVar3 == null || (azrwVar = ytpVar.b) == null || (azrwVar2 = ytpVar.c) == null || (ynxVar = ytpVar.d) == null || (yryVar2 = ytpVar.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (ytpVar.a == null) {
                sb.append(" cronetEngineProvider");
            }
            if (ytpVar.b == null) {
                sb.append(" headerDecoratorProvider");
            }
            if (ytpVar.c == null) {
                sb.append(" uriRewriter");
            }
            if (ytpVar.d == null) {
                sb.append(" commonConfigs");
            }
            if (ytpVar.e == null) {
                sb.append(" httpClientConfig");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ytt(new ytu(azrwVar3, azrwVar, azrwVar2, ynxVar, yryVar2));
    }

    @Override // defpackage.ysc
    public final void b(Executor executor) {
        executor.execute(new ytv(this.a, 0));
    }
}
