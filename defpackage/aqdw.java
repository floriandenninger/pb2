package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdw extends aonm implements aooz {
    public static final aqdw a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public aqiz d;
    public atdf e;
    public long f;
    public apxf g;
    public String h;
    private apmh j;
    private apmh k;
    private aota l;
    private apxf m;
    private byte n = 2;

    static {
        aqdw aqdwVar = new aqdw();
        a = aqdwVar;
        aonm.registerDefaultInstance(aqdw.class, aqdwVar);
    }

    private aqdw() {
        aomf aomfVar = aomf.b;
        this.h = "";
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0007ᐉ\u0002\bᐉ\b\tဈ\t\nဂ\u0003\u000bᐉ\n", new Object[]{"b", "c", "d", "j", "k", "l", "e", "g", "h", "f", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqdw.class) {
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
