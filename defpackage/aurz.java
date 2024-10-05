package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurz extends aonm implements aooz {
    public static final aurz a;
    private static volatile aopf l;
    public int b;
    public aqyg f;
    public aqyg g;
    public aurs h;
    public apxf i;
    private aota m;
    private ausc n;
    private aury o;
    private byte p = 2;
    public String c = "";
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf j = aomf.b;
    public aomf k = aomf.b;

    static {
        aurz aurzVar = new aurz();
        a = aurzVar;
        aonm.registerDefaultInstance(aurz.class, aurzVar);
    }

    private aurz() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0002\t\u0002ဈ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0005\bည\u0006\tည\u0007\nᐉ\b\u000bᐉ\u0004\u0010ᐉ\f\u0011ᐉ\r", new Object[]{"b", "c", "d", aurv.class, "e", aurv.class, "f", "g", "i", "j", "k", "m", "h", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aurz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aurz.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
