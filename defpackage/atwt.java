package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwt extends aonm implements aooz {
    public static final atwt a;
    private static volatile aopf d;
    public int b;
    public atbc c;
    private byte e = 2;

    static {
        atwt atwtVar = new atwt();
        a = atwtVar;
        aonm.registerDefaultInstance(atwt.class, atwtVar);
    }

    private atwt() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0003", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atwt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atwt.class) {
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
