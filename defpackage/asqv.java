package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqv extends aonm implements aooz {
    public static final asqv a;
    private static volatile aopf f;
    public aqyg e;
    private int g;
    private aulq h;
    private aota i;
    private byte j = 2;
    public String b = "";
    public aony c = emptyProtobufList();
    public aomf d = aomf.b;

    static {
        asqv asqvVar = new asqv();
        a = asqvVar;
        aonm.registerDefaultInstance(asqv.class, asqvVar);
    }

    private asqv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ᐉ\u0004", new Object[]{"g", "b", "c", aulq.class, "h", "i", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asqv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asqv.class) {
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
