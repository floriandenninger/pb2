package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgv extends aonm implements aooz {
    public static final avgv a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public aqyg e;
    public int f;
    private int h;
    private byte i = 2;

    static {
        avgv avgvVar = new avgv();
        a = avgvVar;
        aonm.registerDefaultInstance(avgv.class, avgvVar);
    }

    private avgv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ဌ\u0004", new Object[]{"h", "b", "c", "d", "e", "f", arfr.a()});
            case NEW_MUTABLE_INSTANCE:
                return new avgv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avgv.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
