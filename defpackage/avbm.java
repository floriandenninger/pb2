package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbm extends aonm implements aooz {
    public static final avbm a;
    private static volatile aopf m;
    public int b;
    public apxf d;
    public aulq e;
    public apxf f;
    public boolean g;
    public aoyj h;
    public aowz i;
    public int k;
    public boolean l;
    private aota n;
    private byte o = 2;
    public aony c = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        avbm avbmVar = new avbm();
        a = avbmVar;
        aonm.registerDefaultInstance(avbm.class, avbmVar);
    }

    private avbm() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005\bᐉ\u0006\tည\u0007\nဌ\b\u000bဇ\t", new Object[]{"b", "c", avbo.class, "d", "e", "f", "g", "h", "i", "n", "j", "k", auye.n, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avbm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (avbm.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
