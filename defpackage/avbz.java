package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbz extends aonm implements aooz {
    public static final avbz a;
    private static volatile aopf k;
    public int b;
    public aqyg e;
    public apxf f;
    public int h;
    public apmh i;
    public aomf j;
    private aqyg l;
    private apxf m;
    private apxf n;
    private aota o;
    private byte p = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        avbz avbzVar = new avbz();
        a = avbzVar;
        aonm.registerDefaultInstance(avbz.class, avbzVar);
    }

    private avbz() {
        emptyProtobufList();
        this.j = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0003\n\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005Л\u0006ᐉ\u0004\bဌ\u0007\tᐉ\n\nည\u000b\u000bᐉ\t\rᐉ\u0003\u0010Л", new Object[]{"b", "c", avbx.class, "e", "l", "f", "g", avca.class, "n", "h", auye.u, "o", "j", "i", "m", "d", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new avbz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avbz.class) {
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
