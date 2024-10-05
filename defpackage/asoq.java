package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asoq extends aonm implements aooz {
    public static final asoq a;
    private static volatile aopf e;
    public Object c;
    public aott d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        asoq asoqVar = new asoq();
        a = asoqVar;
        aonm.registerDefaultInstance(asoq.class, asoqVar);
    }

    private asoq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0004ဉ\u0003", new Object[]{"c", "b", "f", arfs.class, avgg.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asoq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asoq.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
