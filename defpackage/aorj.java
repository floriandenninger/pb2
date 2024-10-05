package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aorj extends aonm implements aooz {
    public static final aorj a;
    private static volatile aopf n;
    public int b;
    public int d;
    public long e;
    public long f;
    public long g;
    public int i;
    public int j;
    public aorg k;
    public String c = "";
    public String h = "";
    public aonx l = emptyLongList();
    public String m = "";

    static {
        aorj aorjVar = new aorj();
        a = aorjVar;
        aonm.registerDefaultInstance(aorj.class, aorjVar);
    }

    private aorj() {
    }

    public final void a() {
        aonx aonxVar = this.l;
        if (aonxVar.c()) {
            return;
        }
        this.l = aonm.mutableCopy(aonxVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"b", "c", "e", "f", "g", "h", "i", aokr.f, "j", aokr.e, "l", "m", "d", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aorj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aorj.class) {
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
