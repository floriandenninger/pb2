package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avuj extends aonm implements aooz {
    private static volatile aopf E;
    public static final avuj a;
    public boolean A;
    public int B;
    public boolean C;
    public long D;
    private int F;
    private int G;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public String p = "";
    public int q;
    public boolean r;
    public long s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        avuj avujVar = new avuj();
        a = avujVar;
        aonm.registerDefaultInstance(avuj.class, avujVar);
    }

    private avuj() {
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
                return newMessageInfo(a, "\u0001\u001c\u0000\u0003\t[\u001c\u0000\u0000\u0000\tဇ\u0004\nဇ\u0005\rဇ\u000e\u0010ဇ\u0011\u0012ဇ\u0012\u0017ဇ\u0017#ဇ\u001d+ဂ%,ဂ&-ဂ'/င)0င*1င+3င.5ဇ0<ဂ7?ဇ:Eဇ@LဇEMဇFOဇHQဇJRဇKSဈ,WဇOYငPZဇQ[ဂR", new Object[]{"F", "G", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "p", "A", "B", "C", "D"});
            case NEW_MUTABLE_INSTANCE:
                return new avuj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = E;
                if (aopfVar == null) {
                    synchronized (avuj.class) {
                        aopfVar = E;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            E = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
