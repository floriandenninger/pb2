package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auuo extends aonm implements aooz {
    public static final auuo a;
    private static volatile aopf g;
    public int b;
    public apxf c;
    public apud e;
    public avuz f;
    private byte h = 2;
    public String d = "";

    static {
        auuo auuoVar = new auuo();
        a = auuoVar;
        aonm.registerDefaultInstance(auuo.class, auuoVar);
    }

    private auuo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ဈ\u0005\u0007ဉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auuo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auuo.class) {
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
