package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awvr extends aonm implements aooz {
    public static final awvr a;
    private static volatile aopf v;
    public int b;
    public afil e;
    public int f;
    public int m;
    public int n;
    public long o;
    public boolean q;
    public afim r;
    public boolean s;
    public awvk t;
    public awvk u;
    public aoot d = aoot.a;
    public aoot h = aoot.a;
    public aoot i = aoot.a;
    public aoot j = aoot.a;
    public aoot k = aoot.a;
    public aoot l = aoot.a;
    public long c = -1;
    public String g = "";
    public String p = "";

    static {
        awvr awvrVar = new awvr();
        a = awvrVar;
        aonm.registerDefaultInstance(awvr.class, awvrVar);
    }

    private awvr() {
    }

    public final aoot a() {
        aoot aootVar = this.l;
        if (!aootVar.b) {
            this.l = aootVar.a();
        }
        return this.l;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0006\u0000\u0000\u0001ဂ\u0000\u00022\u0003ဉ\u0001\u0004င\u0002\u0005ဈ\u0003\u00062\u00072\b2\t2\n2\u000bဌ\u0004\fဌ\u0005\rဂ\u0006\u000eဈ\u0007\u000fဇ\b\u0010ဉ\t\u0011ဇ\n\u0012ဉ\u000b\u0013ဉ\f", new Object[]{"b", "c", "d", awvl.a, "e", "f", "g", "h", awvn.a, "i", awvo.a, "j", awvm.a, "k", awvp.a, "l", awvq.a, "m", avzr.a(), "n", avzr.a(), "o", "p", "q", "r", "s", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new awvr();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (awvr.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
