package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardg extends aonm implements aooz {
    public static final ardg a;
    private static volatile aopf d;
    public int b;
    public String c;
    private aqyg e;
    private aqyg f;
    private aota g;
    private ardh h;
    private byte i = 2;

    static {
        ardg ardgVar = new ardg();
        a = ardgVar;
        aonm.registerDefaultInstance(ardg.class, ardgVar);
    }

    private ardg() {
        aomf aomfVar = aomf.b;
        this.c = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\b\u0013\u0005\u0000\u0000\u0004\bᐉ\n\nᐉ\u0002\u000bᐉ\u0004\fᐉ\f\u0013ဈ\u0012", new Object[]{"b", "g", "e", "f", "h", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ardg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ardg.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
