package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigu implements ypd {
    public String a;
    public volatile boolean c;
    public volatile boolean e;
    public volatile boolean f;
    public volatile int d = 3;
    public volatile AtomicInteger b = new AtomicInteger();
    public volatile boolean g = true;

    public final boolean a() {
        return this.d == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, aiew.class, aiex.class, aiez.class, aigw.class};
        }
        if (i == 0) {
            aiew aiewVar = aiew.NAVIGATION;
            aign aignVar = aign.NEW;
            aiey aieyVar = aiey.START;
            int ordinal = ((ahef) obj).c().ordinal();
            if (ordinal != 5) {
                if (ordinal != 8 || !this.c) {
                    return null;
                }
                this.b.incrementAndGet();
                this.c = false;
                return null;
            }
            this.b.set(0);
            this.c = false;
            return null;
        }
        if (i == 1) {
            aiew aiewVar2 = aiew.NAVIGATION;
            aign aignVar2 = aign.NEW;
            aiey aieyVar2 = aiey.START;
            int ordinal2 = ((aiew) obj).ordinal();
            if (ordinal2 == 0) {
                this.d = 1;
                return null;
            }
            if (ordinal2 != 1) {
                return null;
            }
            this.d = 2;
            return null;
        }
        if (i == 2) {
            this.a = ((aiex) obj).a();
            return null;
        }
        if (i != 3) {
            if (i == 4) {
                this.b.incrementAndGet();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        aiew aiewVar3 = aiew.NAVIGATION;
        aign aignVar3 = aign.NEW;
        aiey aieyVar3 = aiey.START;
        switch (((aiez) obj).a()) {
            case START:
            case RETRY:
                this.g = true;
                break;
            case NEXT:
            case PREVIOUS:
            case JUMP:
                this.g = true;
                this.b.set(0);
                this.c = false;
                this.e = false;
                this.f = false;
                break;
            case AUTOPLAY:
            case AUTONAV:
                this.c = true;
                this.e = true;
                this.f = true;
                break;
            case INSERT:
                this.b.set(0);
                this.c = false;
                this.e = false;
                this.f = false;
                break;
        }
        if (this.d == 1) {
            this.d = 2;
            return null;
        }
        this.d = 3;
        return null;
    }
}
