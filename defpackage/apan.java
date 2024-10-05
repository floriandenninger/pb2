package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apan extends aonm implements aooz {
    private static final apan a;
    private static volatile aopf b;
    private int c;
    private int d;
    private apai e;
    private int g;
    private aomf f = aomf.b;
    private aomf h = aomf.b;

    static {
        apan apanVar = new apan();
        a = apanVar;
        aonm.registerDefaultInstance(apan.class, apanVar);
    }

    private apan() {
    }

    public static apam a() {
        return (apam) a.createBuilder();
    }

    public static /* synthetic */ apan b() {
        return a;
    }

    public void h(apai apaiVar) {
        apaiVar.getClass();
        this.e = apaiVar;
        this.c |= 2;
    }

    public void i(int i) {
        this.c |= 8;
        this.g = i;
    }

    public void j(apaa apaaVar) {
        this.d = apaaVar.S;
        this.c |= 1;
    }

    public void k(aomf aomfVar) {
        aomfVar.getClass();
        this.c |= 4;
        this.f = aomfVar;
    }

    public void l(aomf aomfVar) {
        aomfVar.getClass();
        this.c |= 16;
        this.h = aomfVar;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"c", "d", apaa.a(), "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apan();
            case NEW_BUILDER:
                return new apam();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apan.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
