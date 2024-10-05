package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxj extends aonm implements aooz {
    public static final avxj a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public String e;

    static {
        avxj avxjVar = new avxj();
        a = avxjVar;
        aonm.registerDefaultInstance(avxj.class, avxjVar);
    }

    private avxj() {
        emptyProtobufList();
        this.e = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000", new Object[]{"b", "c", avxc.class, "d", avxg.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avxj();
            case NEW_BUILDER:
                return new aone((short[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avxj.class) {
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
