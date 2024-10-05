package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansk extends aonm implements aooz {
    private static final ansk a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    static {
        ansk anskVar = new ansk();
        a = anskVar;
        aonm.registerDefaultInstance(ansk.class, anskVar);
    }

    private ansk() {
    }

    public static ansj a() {
        return (ansj) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        this.c |= 16;
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i) {
        this.c |= 128;
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i) {
        this.c |= 2;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        this.c |= 32;
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        this.c |= 4;
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i) {
        this.c |= 8;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i) {
        this.c |= 1;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i) {
        this.c |= 64;
        this.j = i;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ansk();
            case NEW_BUILDER:
                return new ansj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ansk.class) {
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
