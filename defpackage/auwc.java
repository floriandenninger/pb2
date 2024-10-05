package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwc extends aonm implements aooz {
    public static final auwc a;
    private static volatile aopf n;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public apkd f;
    public apkd g;
    public apxf j;
    public int k;
    public int l;
    public auwb m;
    private aota o;
    private aulq p;
    private byte q = 2;
    public aony h = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        auwc auwcVar = new auwc();
        a = auwcVar;
        aonm.registerDefaultInstance(auwc.class, auwcVar);
    }

    private auwc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bည\u0006\tᐉ\u0007\nᐉ\b\u000bဌ\t\fဌ\n\rဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", apjt.class, "o", "i", "p", "j", "k", auqy.q, "l", arfr.a(), "m"});
            case NEW_MUTABLE_INSTANCE:
                return new auwc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (auwc.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
