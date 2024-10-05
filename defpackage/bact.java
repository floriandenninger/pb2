package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bact extends aonm implements aooz {
    public static final bact a;
    private static volatile aopf u;
    public int b;
    public babm c;
    public long d;
    public bacf f;
    public babs g;
    public bach h;
    public bacr i;
    public bacn j;
    public baax k;
    public bacl l;
    public babg m;
    public babx n;
    public bace p;
    public bacj q;
    public bacs r;
    public baci s;
    public baat t;
    private bacg v;
    private byte w = 2;
    public String e = "";
    public String o = "";

    static {
        bact bactVar = new bact();
        a = bactVar;
        aonm.registerDefaultInstance(bact.class, bactVar);
    }

    private bact() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001 \u0013\u0000\u0000\b\u0001ᐉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nᐉ\t\fဉ\u000b\u000eᐉ\r\u0010ᐉ\u000e\u0011ဈ\u000f\u0015ဉ\u0013\u0017ဉ\u0015\u001dᐉ\u0018\u001eဉ\u0019\u001fဉ\u001a ဉ\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "v", "r", "s", "t"});
            case NEW_MUTABLE_INSTANCE:
                return new bact();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (bact.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
