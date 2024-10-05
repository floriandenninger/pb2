package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmm extends aonm implements aooz {
    public static final asmm a;
    private static volatile aopf k;
    public int b;
    public boolean e;
    public long f;
    public int h;
    public int i;
    public asmk j;
    public aony c = emptyProtobufList();
    public String d = "";
    public String g = "";

    static {
        asmm asmmVar = new asmm();
        a = asmmVar;
        aonm.registerDefaultInstance(asmm.class, asmmVar);
    }

    private asmm() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007င\u0005\bင\u0006\nဉ\b", new Object[]{"b", "c", asml.class, "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asmm();
            case NEW_BUILDER:
                return new aone((byte[]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asmm.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
