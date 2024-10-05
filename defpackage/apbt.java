package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbt extends aonm implements aooz {
    public static final apbt a;
    private static volatile aopf g;
    public int b;
    public apxf f;
    private aota h;
    private byte i = 2;
    public aomf c = aomf.b;
    public String d = "";
    public String e = "";

    static {
        apbt apbtVar = new apbt();
        a = apbtVar;
        aonm.registerDefaultInstance(apbt.class, apbtVar);
    }

    private apbt() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"b", "h", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apbt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apbt.class) {
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
