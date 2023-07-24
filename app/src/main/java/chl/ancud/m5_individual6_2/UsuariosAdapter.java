package chl.ancud.m5_individual6_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import chl.ancud.m5_individual6_2.databinding.ItemBinding;
import com.bumptech.glide.Glide;


public class UsuariosAdapter extends RecyclerView.Adapter<UsuariosAdapter.viewHolder> {

    ArrayList<Usuario> usuarios =new ArrayList<>();

    @NonNull
    @Override
    public UsuariosAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuariosAdapter.viewHolder holder, int position) {
        Usuario usuario = usuarios.get(position);
        holder.bind(usuario);

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public void setUsuarios(ArrayList<Usuario> datos) {
        this.usuarios = datos;
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;

        public viewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

         public void bind (Usuario usuario) {
            binding.tvDescripcion.setText(usuario.getNombre());
            Glide.with(binding.getRoot()).load(usuario.getImagen()).into(binding.imgFoto);
         }
    }
}
