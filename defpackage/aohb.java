package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohb extends aonm implements aooz {
    public static final aohb a;
    private static volatile aopf l;
    public int b;
    public aony c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public aoht f;
    public aoia g;
    public aohg h;
    public long i;
    public long j;
    public aohn k;

    static {
        aohb aohbVar = new aohb();
        a = aohbVar;
        aonm.registerDefaultInstance(aohb.class, aohbVar);
    }

    private aohb() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0001\u0007ဉ\u0004\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"b", "c", aoha.class, "d", "f", "g", "e", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aohb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aohb.class) {
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
