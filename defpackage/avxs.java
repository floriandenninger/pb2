package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxs extends aonm implements aooz {
    public static final avxs a;
    private static volatile aopf i;
    public int b;
    public avxr g;
    public aony h;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public aomf d = aomf.b;
    public aony e = aonm.emptyProtobufList();
    public aony f = aonm.emptyProtobufList();

    static {
        avxs avxsVar = new avxs();
        a = avxsVar;
        aonm.registerDefaultInstance(avxs.class, avxsVar);
    }

    private avxs() {
        aonm.emptyProtobufList();
        this.h = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001Л\u0002ည\u0000\u0003\u001a\u0004\u001a\u0006ဉ\u0001\b\u001b", new Object[]{"b", "c", avxq.class, "d", "e", "f", "g", "h", avxp.class});
            case NEW_MUTABLE_INSTANCE:
                return new avxs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avxs.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
