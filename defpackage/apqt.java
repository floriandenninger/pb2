package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqt extends aonh implements aoni {
    public static final apqt a;
    private static volatile aopf m;
    public int b;
    public Object d;
    public avgg e;
    public apxf f;
    public aott h;
    public apqs i;
    public aqyg j;
    private aota n;
    public int c = 0;
    private byte o = 2;
    public aomf g = aomf.b;
    public String k = "";

    static {
        apqt apqtVar = new apqt();
        a = apqtVar;
        aonm.registerDefaultInstance(apqt.class, apqtVar);
    }

    private apqt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ဿ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ည\u0005\u0006ဉ\u0006\u0007ᐉ\u0007\bᐉ\b\nျ\u0000\u000bဈ\n", new Object[]{"d", "c", "b", "e", apqx.a(), "f", "n", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apqt();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apqt.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
