package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyi extends aonm implements aooz {
    private static volatile aopf L;
    public static final atyi a;
    public apee A;
    public auyf B;
    public aped C;
    public aumk D;
    public aoyp E;
    public auae F;
    public astb G;
    public apwx H;
    public aqhw I;

    /* renamed from: J, reason: collision with root package name */
    public asyn f119J;
    public atyr K;
    private awfd M;
    private byte N = 2;
    public int b;
    public int c;
    public aqdn d;
    public aquz e;
    public apgk f;
    public atxt g;
    public atxd h;
    public aoyk i;
    public apdl j;
    public apdx k;
    public atmi l;
    public atyj m;
    public asnd n;
    public aoyv o;
    public auys p;
    public aoym q;
    public auvh r;
    public atbl s;
    public avvf t;
    public aqiq u;
    public awaz v;
    public apca w;
    public auag x;
    public auik y;
    public aqif z;

    static {
        atyi atyiVar = new atyi();
        a = atyiVar;
        aonm.registerDefaultInstance(atyi.class, atyiVar);
    }

    private atyi() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.N);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.N = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001#\u0000\u0002\uecf6ᩫﶝ紅#\u0000\u0000\u0002\uecf6ᩫဉ\u0006\uf6f3ᮒဉ\u0001\uf5b9Შဉ\u0007\ue901₱ဉ\f\uf166₴ဉ\u000f\ue0e9™ဉ\u000e\uf5f4⎗ဉ\u0014ﱡ┤ဉ\u0015\uef6c▦ဉ\r\uf390⢵ဉ\u0016\uf53f⪙ဉ\u0018\ue5c0ⱈဉ\u001a鬒Ⳮဉ\u0011\uf29e⺷ᐉ\u001e\ue173⼗ဉ\u001d﵃らဉ\u001f\ue1abㄞဉ \ue2cc㓖ဉ#ﲬ㟵ဉ$\ueef5㠘ဉ&﹊㡎ဉ%\ue912㤁ဉ'\ue5b5㥳ဉ(\ue9ae㮀ဉ*ﭑ㯕ဉ,\ue2d6㹳ဉ.\uf66d䉪ဉ/\ue4e9䉴ဉ+\uf463䧻ဉ0\uea9b䪟ဉ\b\ue708圭ဉ2\ue9c0曣ဉ\u0000\uf010癝ဉ7珞皍ᐉ6ﶝ紅ဉ9", new Object[]{"b", "c", "f", "e", "g", "i", "l", "k", "n", "o", "j", "p", "q", "r", "m", "t", "s", "u", "v", "w", "x", "z", "y", "A", "B", "C", "E", "F", "G", "D", "H", "h", "I", "d", "J", "M", "K"});
            case NEW_MUTABLE_INSTANCE:
                return new atyi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = L;
                if (aopfVar == null) {
                    synchronized (atyi.class) {
                        aopfVar = L;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            L = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
