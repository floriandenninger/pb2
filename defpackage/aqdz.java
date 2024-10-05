package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdz extends aonm implements aooz {
    public static final aqdz a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqiz d;
    public long e;
    public apxf f;
    public String g;
    private apmh i;
    private aqyg j;
    private apxf k;
    private aqyg l;
    private aota m;
    private atdf n;
    private byte o = 2;

    static {
        aqdz aqdzVar = new aqdz();
        a = aqdzVar;
        aonm.registerDefaultInstance(aqdz.class, aqdzVar);
    }

    private aqdz() {
        aomf aomfVar = aomf.b;
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\b\u0006ᐉ\u0004\u0007ᐉ\n\bဈ\f\tဂ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\u000b", new Object[]{"b", "c", "d", "i", "m", "j", "f", "g", "e", "k", "l", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqdz.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
