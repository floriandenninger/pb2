package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avaa extends aonm implements aooz {
    public static final avaa a;
    private static volatile aopf j;
    public int b;
    public int d;
    public int e;
    public arel g;
    public int h;
    private apxf k;
    private aota l;
    private byte m = 2;
    public aony c = emptyProtobufList();
    public aony f = aonm.emptyProtobufList();
    public aomf i = aomf.b;

    static {
        avaa avaaVar = new avaa();
        a = avaaVar;
        aonm.registerDefaultInstance(avaa.class, avaaVar);
    }

    private avaa() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0004\u0001Л\u0002င\u0000\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ည\u0007\u0007င\u0001\bဌ\u0005\t\u001a\nᐉ\u0003", new Object[]{"b", "c", avab.class, "d", "g", "l", "i", "e", "h", atnn.b, "f", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new avaa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avaa.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
