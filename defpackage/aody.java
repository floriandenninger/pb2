package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aody extends aonm implements aooz {
    public static final aody a;
    private static volatile aopf c;
    public alvz b;
    private byte d = 2;

    static {
        aody aodyVar = new aody();
        a = aodyVar;
        aonm.registerDefaultInstance(aody.class, aodyVar);
    }

    private aody() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj != null ? (byte) 1 : (byte) 0;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new aody();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aody.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
