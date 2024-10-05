package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aruq extends aonm implements aooz {
    public static final aruq a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public arnb e;
    public int c = 0;
    private byte h = 2;
    public String f = "";

    static {
        aruq aruqVar = new aruq();
        a = aruqVar;
        aonm.registerDefaultInstance(aruq.class, aruqVar);
    }

    private aruq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004ျ\u0000\u0005ွ\u0000\u0006ျ\u0000\u0007ျ\u0000\bွ\u0000", new Object[]{"d", "c", "b", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aruq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aruq.class) {
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
