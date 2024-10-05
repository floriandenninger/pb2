package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqa extends aonm implements aooz {
    public static final atqa a;
    private static volatile aopf n;
    public int b;
    public avgg d;
    public atot e;
    public long i;
    public boolean k;
    public aqyg l;
    public long m;
    private byte o = 2;
    public String c = "";
    public aony f = emptyProtobufList();
    public String g = "";
    public String h = "";
    public aony j = emptyProtobufList();

    static {
        atqa atqaVar = new atqa();
        a = atqaVar;
        aonm.registerDefaultInstance(atqa.class, atqaVar);
    }

    private atqa() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0005\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bЛ\tဇ\u0006\u000bᐉ\b\fဂ\t", new Object[]{"b", "c", "d", "e", "f", atqy.class, "g", "h", "i", "j", atpz.class, "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new atqa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (atqa.class) {
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
