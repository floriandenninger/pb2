package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmd extends aonm implements aooz {
    public static final apmd a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public apxf g;
    public aulq h;
    public int j;
    public avgg k;
    private aota n;
    private byte o = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public String i = "";
    public aomf l = aomf.b;

    static {
        apmd apmdVar = new apmd();
        a = apmdVar;
        aonm.registerDefaultInstance(apmd.class, apmdVar);
    }

    private apmd() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ဈ\u0004\bᐉ\b\tည\u0007\nဌ\u0005\u000bᐉ\u0006", new Object[]{"b", "c", "d", "e", aqyg.class, "f", avgg.class, "g", "h", "i", "n", "l", "j", apld.i, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apmd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apmd.class) {
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
