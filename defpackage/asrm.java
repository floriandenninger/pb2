package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrm extends aonm implements aooz {
    public static final asrm a;
    private static volatile aopf k;
    public avgg c;
    public int d;
    public int e;
    public int f;
    public int g;
    public apxf h;
    private int l;
    private aota m;
    private byte n = 2;
    public String b = "";
    public String i = "";
    public aony j = emptyProtobufList();

    static {
        asrm asrmVar = new asrm();
        a = asrmVar;
        aonm.registerDefaultInstance(asrm.class, asrmVar);
    }

    private asrm() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ᐉ\u0006\bဈ\u0007\nЛ\u000bᐉ\t", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i", "j", avgg.class, "m"});
            case NEW_MUTABLE_INSTANCE:
                return new asrm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asrm.class) {
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
