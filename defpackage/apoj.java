package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apoj extends aonh implements aoni {
    public static final apoj a;
    private static volatile aopf j;
    public int b;
    public apol d;
    public int e;
    public apoi f;
    public aulq g;
    private aota k;
    private byte m = 2;
    public aony c = emptyProtobufList();
    public aomf h = aomf.b;
    public aony i = emptyProtobufList();

    static {
        apoj apojVar = new apoj();
        a = apojVar;
        aonm.registerDefaultInstance(apoj.class, apojVar);
    }

    private apoj() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0005\u0001Л\u0002ᐉ\u0000\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ည\u0007\tဌ\u0001\nᐉ\u0006\u000bЛ", new Object[]{"b", "c", apok.class, "d", "f", "k", "h", "e", apld.p, "g", "i", avgg.class});
            case NEW_MUTABLE_INSTANCE:
                return new apoj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apoj.class) {
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
