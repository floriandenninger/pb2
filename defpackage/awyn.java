package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyn extends aonm implements aooz {
    public static final awyn a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        awyn awynVar = new awyn();
        a = awynVar;
        aonm.registerDefaultInstance(awyn.class, awynVar);
    }

    private awyn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000", new Object[]{"d", "c", "b", "e", awyj.class, awyh.class, awyg.class, awym.class, awyk.class, awyl.class, awyi.class});
            case NEW_MUTABLE_INSTANCE:
                return new awyn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awyn.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
