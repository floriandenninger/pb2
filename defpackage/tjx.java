package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjx extends aonm implements aooz {
    public static final tjx a;
    private static volatile aopf n;
    public int b;
    public int f;
    public int g;
    public long i;
    public aols l;
    public aols m;
    public String c = "";
    public String d = "";
    public String e = "";
    public aony h = emptyProtobufList();
    public String j = "";
    public aony k = aonm.emptyProtobufList();

    static {
        tjx tjxVar = new tjx();
        a = tjxVar;
        aonm.registerDefaultInstance(tjx.class, tjxVar);
    }

    private tjx() {
    }

    public final void a() {
        aony aonyVar = this.h;
        if (aonyVar.c()) {
            return;
        }
        this.h = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b", new Object[]{"b", "c", "h", tjw.class, "d", "f", "g", sgo.g, "e", "i", "k", "l", "j", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new tjx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (tjx.class) {
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
